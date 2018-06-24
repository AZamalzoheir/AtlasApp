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

public class thirdFragment extends Fragment {
    private ArrayList<TextAtlasInSections> textAtlasInSectionsArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TextInSectionAdapter textInSectionAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.third_section_fragment_layout, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_third);
        textInSectionAdapter = new TextInSectionAdapter(textAtlasInSectionsArrayList);
        RecyclerView.LayoutManager textLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(textLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(textInSectionAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity().getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                TextAtlasInSections textAtlasInSections = textAtlasInSectionsArrayList.get(position);
                Intent intentContent = new Intent(getActivity(), Thirdgoal.class);
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
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.introduction), R.mipmap.yellowicon, 2));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.ThirdTopicWriteCodeForProject), R.mipmap.blueicon, 3));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.ThirdTopicWriteCode), R.mipmap.greenicon, 4));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.ThirdTopicWriteCodeWithData), R.mipmap.blueicon, 5));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.activities), R.mipmap.greenicon, 6));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.final_homework), R.mipmap.redicon, 7));
        textInSectionAdapter.notifyDataSetChanged();
    }
}

