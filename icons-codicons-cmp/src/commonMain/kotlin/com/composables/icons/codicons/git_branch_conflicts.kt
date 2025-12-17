package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitBranchConflicts: ImageVector
    get() {
        if (_GitBranchConflicts != null) return _GitBranchConflicts!!
        
        _GitBranchConflicts = ImageVector.Builder(
            name = "git-branch-conflicts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.07f, 11.07f)
                verticalLineTo(11.072f)
                curveTo(5.226f, 10.55f, 5.662f, 10.163f, 6.2f, 10.05f)
                curveTo(6.3f, 9.683f, 6.437f, 9.332f, 6.607f, 9f)
                horizontalLineTo(6.5f)
                curveTo(5.935f, 9f, 5.419f, 9.195f, 5f, 9.512f)
                verticalLineTo(4.949f)
                curveTo(6.14f, 4.717f, 7f, 3.707f, 7f, 2.5f)
                curveTo(7f, 1.121f, 5.879f, 0f, 4.5f, 0f)
                curveTo(3.121f, 0f, 2f, 1.121f, 2f, 2.5f)
                curveTo(2f, 3.708f, 2.86f, 4.717f, 4f, 4.949f)
                verticalLineTo(11.05f)
                curveTo(2.86f, 11.282f, 2f, 12.292f, 2f, 13.499f)
                curveTo(2f, 14.878f, 3.121f, 15.999f, 4.5f, 15.999f)
                curveTo(5.565f, 15.999f, 6.469f, 15.328f, 6.829f, 14.388f)
                curveTo(6.31f, 13.552f, 6.004f, 12.57f, 6.001f, 11.516f)
                curveTo(5.727f, 11.309f, 5.415f, 11.151f, 5.07f, 11.07f)
                close()
                moveTo(2.999f, 2.501f)
                curveTo(2.999f, 1.674f, 3.672f, 1.001f, 4.499f, 1.001f)
                curveTo(5.326f, 1.001f, 5.999f, 1.674f, 5.999f, 2.501f)
                curveTo(5.999f, 3.328f, 5.326f, 4.001f, 4.499f, 4.001f)
                curveTo(3.672f, 4.001f, 2.999f, 3.328f, 2.999f, 2.501f)
                close()
                moveTo(4.499f, 15.001f)
                curveTo(3.672f, 15.001f, 2.999f, 14.328f, 2.999f, 13.501f)
                curveTo(2.999f, 12.674f, 3.672f, 12.001f, 4.499f, 12.001f)
                curveTo(5.326f, 12.001f, 5.999f, 12.674f, 5.999f, 13.501f)
                curveTo(5.999f, 14.328f, 5.326f, 15.001f, 4.499f, 15.001f)
                close()
                moveTo(9.22f, 6.503f)
                curveTo(9.522f, 6.365f, 9.838f, 6.254f, 10.166f, 6.172f)
                curveTo(10.063f, 5.969f, 10f, 5.743f, 10f, 5.501f)
                curveTo(10f, 4.674f, 10.673f, 4.001f, 11.5f, 4.001f)
                curveTo(12.327f, 4.001f, 13f, 4.674f, 13f, 5.501f)
                curveTo(13f, 5.744f, 12.936f, 5.969f, 12.834f, 6.172f)
                curveTo(13.162f, 6.254f, 13.478f, 6.365f, 13.78f, 6.503f)
                curveTo(13.916f, 6.195f, 13.999f, 5.859f, 13.999f, 5.501f)
                curveTo(13.999f, 4.122f, 12.878f, 3.001f, 11.499f, 3.001f)
                curveTo(10.12f, 3.001f, 8.999f, 4.122f, 8.999f, 5.501f)
                curveTo(8.999f, 5.859f, 9.083f, 6.195f, 9.219f, 6.502f)
                lineTo(9.22f, 6.503f)
                close()
                moveTo(11.499f, 7.001f)
                curveTo(9.014f, 7.001f, 6.999f, 9.016f, 6.999f, 11.501f)
                curveTo(6.999f, 13.986f, 9.014f, 16.001f, 11.499f, 16.001f)
                curveTo(13.984f, 16.001f, 15.999f, 13.986f, 15.999f, 11.501f)
                curveTo(15.999f, 9.016f, 13.984f, 7.001f, 11.499f, 7.001f)
                close()
                moveTo(10.999f, 9f)
                curveTo(10.999f, 8.867f, 11.052f, 8.74f, 11.145f, 8.646f)
                curveTo(11.239f, 8.552f, 11.366f, 8.5f, 11.499f, 8.5f)
                curveTo(11.632f, 8.5f, 11.759f, 8.553f, 11.853f, 8.646f)
                curveTo(11.947f, 8.74f, 11.999f, 8.867f, 11.999f, 9f)
                verticalLineTo(11.501f)
                curveTo(11.999f, 11.634f, 11.946f, 11.761f, 11.853f, 11.855f)
                curveTo(11.76f, 11.949f, 11.632f, 12.001f, 11.499f, 12.001f)
                curveTo(11.366f, 12.001f, 11.239f, 11.948f, 11.145f, 11.855f)
                curveTo(11.051f, 11.762f, 10.999f, 11.634f, 10.999f, 11.501f)
                verticalLineTo(9f)
                close()
                moveTo(11.5f, 14.251f)
                curveTo(11.086f, 14.251f, 10.75f, 13.915f, 10.75f, 13.501f)
                curveTo(10.75f, 13.087f, 11.086f, 12.751f, 11.5f, 12.751f)
                curveTo(11.914f, 12.751f, 12.25f, 13.087f, 12.25f, 13.501f)
                curveTo(12.25f, 13.915f, 11.914f, 14.251f, 11.5f, 14.251f)
                close()
            }
        }.build()
        
        return _GitBranchConflicts!!
    }

private var _GitBranchConflicts: ImageVector? = null

