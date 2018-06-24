package com.example.amalzoheir.atlasapp;

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

public class intoductionFragment extends Fragment {
    private ArrayList<TextAtlasInSections> textAtlasInSectionsArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TextInSectionAdapter textInSectionAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.introduction_fragment_layout, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_introduction);
        textInSectionAdapter = new TextInSectionAdapter(textAtlasInSectionsArrayList);
        RecyclerView.LayoutManager textLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(textLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(textInSectionAdapter);
        prepareDataInTextInSections();
        return rootView;
    }

    private void prepareDataInTextInSections() {
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.main_domain), R.mipmap.greenicon, 1));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.at_the_end_of_section), R.mipmap.redicon, 2));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.introduction), R.mipmap.yellowicon, 3));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.design_project), R.mipmap.blueicon, 4));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.put_control_tool), R.mipmap.greenicon, 5));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.notes), R.mipmap.redicon, 6));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.homework), R.mipmap.yellowicon, 7));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.remember), R.mipmap.blueicon, 8));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.activities), R.mipmap.greenicon, 9));
        textAtlasInSectionsArrayList.add(new TextAtlasInSections(getString(R.string.final_homework), R.mipmap.redicon, 10));
        textInSectionAdapter.notifyDataSetChanged();
    }
}

