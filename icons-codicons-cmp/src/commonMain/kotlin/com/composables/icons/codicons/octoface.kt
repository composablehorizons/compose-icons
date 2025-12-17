package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Octoface: ImageVector
    get() {
        if (_Octoface != null) return _Octoface!!
        
        _Octoface = ImageVector.Builder(
            name = "octoface",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.8625f, 5.67254f)
                curveTo(13.9762f, 5.39254f, 14.3438f, 4.28129f, 13.7487f, 2.77629f)
                curveTo(13.7487f, 2.77629f, 12.83f, 2.48754f, 10.7388f, 3.91379f)
                curveTo(9.86375f, 3.66879f, 8.9275f, 3.63379f, 8f, 3.63379f)
                curveTo(7.0725f, 3.63379f, 6.13625f, 3.66879f, 5.26125f, 3.91379f)
                curveTo(3.17f, 2.47879f, 2.25125f, 2.77629f, 2.25125f, 2.77629f)
                curveTo(1.65625f, 4.28129f, 2.02375f, 5.39254f, 2.1375f, 5.67254f)
                curveTo(1.42875f, 6.43379f, 1f, 7.41379f, 1f, 8.60379f)
                curveTo(1f, 13.11f, 3.91375f, 14.125f, 7.9825f, 14.125f)
                curveTo(12.0513f, 14.125f, 15f, 13.11f, 15f, 8.60379f)
                curveTo(15f, 7.41379f, 14.5712f, 6.43379f, 13.8625f, 5.67254f)
                close()
                moveTo(8f, 13.2675f)
                curveTo(5.1125f, 13.2675f, 2.7675f, 13.1363f, 2.7675f, 10.3363f)
                curveTo(2.7675f, 9.67129f, 3.1f, 9.04129f, 3.66f, 8.52504f)
                curveTo(4.59625f, 7.66754f, 6.1975f, 8.12254f, 8f, 8.12254f)
                curveTo(9.81125f, 8.12254f, 11.395f, 7.66754f, 12.34f, 8.52504f)
                curveTo(12.9087f, 9.04129f, 13.2325f, 9.66254f, 13.2325f, 10.3363f)
                curveTo(13.2325f, 13.1275f, 10.8875f, 13.2675f, 8f, 13.2675f)
                close()
                moveTo(5.80375f, 8.88379f)
                curveTo(5.22625f, 8.88379f, 4.75375f, 9.58379f, 4.75375f, 10.4413f)
                curveTo(4.75375f, 11.2988f, 5.22625f, 12.0075f, 5.80375f, 12.0075f)
                curveTo(6.38125f, 12.0075f, 6.85375f, 11.3075f, 6.85375f, 10.4413f)
                curveTo(6.85375f, 9.57504f, 6.38125f, 8.88379f, 5.80375f, 8.88379f)
                close()
                moveTo(10.1962f, 8.88379f)
                curveTo(9.61875f, 8.88379f, 9.14625f, 9.57504f, 9.14625f, 10.4413f)
                curveTo(9.14625f, 11.3075f, 9.61875f, 12.0075f, 10.1962f, 12.0075f)
                curveTo(10.7738f, 12.0075f, 11.2463f, 11.3075f, 11.2463f, 10.4413f)
                curveTo(11.2463f, 9.57504f, 10.7825f, 8.88379f, 10.1962f, 8.88379f)
                close()
            }
        }.build()
        
        return _Octoface!!
    }

private var _Octoface: ImageVector? = null

