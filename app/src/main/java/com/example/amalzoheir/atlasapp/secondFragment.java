package com.example.amalzoheir.atlasapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class secondFragment extends Fragment {
    private ArrayList<TextAtlasInSections> textAtlasInSectionsArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TextInSectionAdapter textInSectionAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.second_section_fragment_layout, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_second);
        textInSectionAdapter = new TextInSectionAdapter(textAtlasInSectionsArrayList);
        RecyclerView.LayoutManager textLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(textLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(textInSectionAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity().getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                TextAtlasInSections textAtlasInSections = textAtlasInSectionsArrayList.get(position);
                Intent intentContent = new Intent(getActivity(), secondGoal.class);
                intentContent.putExtra("position", textAtlasInSections.getPosition());
                startActivity(intentContent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        prepareDataInTextInSections();
        return rootView;
    }

    private void prepareDataInTextInSections() {
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.main_domain), R.mipmap.greenicon, 1));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.introduction), R.mipmap.redicon, 2));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.annonceForFunction), R.mipmap.yellowicon, 3));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.annonceForVariables), R.mipmap.blueicon, 4));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.explainCode), R.mipmap.greenicon, 5));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.useFunction), R.mipmap.redicon, 6));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.remember), R.mipmap.blueicon, 7));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.activities), R.mipmap.greenicon, 8));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.final_homework), R.mipmap.redicon, 9));
        textInSectionAdapter.notifyDataSetChanged();
    }
}

