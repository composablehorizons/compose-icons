package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Robot: ImageVector
    get() {
        if (_Robot != null) return _Robot!!
        
        _Robot = ImageVector.Builder(
            name = "robot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 9f)
                horizontalLineTo(4f)
                curveTo(3.173f, 9f, 2.5f, 9.673f, 2.5f, 10.5f)
                verticalLineTo(11f)
                curveTo(2.5f, 11.123f, 2.562f, 14f, 8f, 14f)
                curveTo(13.438f, 14f, 13.5f, 11.123f, 13.5f, 11f)
                verticalLineTo(10.5f)
                curveTo(13.5f, 9.673f, 12.827f, 9f, 12f, 9f)
                close()
                moveTo(12.5f, 10.991f)
                curveTo(12.497f, 11.073f, 12.372f, 13f, 8f, 13f)
                curveTo(3.628f, 13f, 3.503f, 11.073f, 3.5f, 11f)
                verticalLineTo(10.5f)
                curveTo(3.5f, 10.224f, 3.724f, 10f, 4f, 10f)
                horizontalLineTo(12f)
                curveTo(12.276f, 10f, 12.5f, 10.224f, 12.5f, 10.5f)
                verticalLineTo(10.991f)
                close()
                moveTo(5.5f, 8f)
                horizontalLineTo(10.5f)
                curveTo(11.327f, 8f, 12f, 7.327f, 12f, 6.5f)
                verticalLineTo(3.5f)
                curveTo(12f, 2.673f, 11.327f, 2f, 10.5f, 2f)
                horizontalLineTo(8.5f)
                verticalLineTo(1.5f)
                curveTo(8.5f, 1.224f, 8.276f, 1f, 8f, 1f)
                curveTo(7.724f, 1f, 7.5f, 1.224f, 7.5f, 1.5f)
                verticalLineTo(2f)
                horizontalLineTo(5.5f)
                curveTo(4.673f, 2f, 4f, 2.673f, 4f, 3.5f)
                verticalLineTo(6.5f)
                curveTo(4f, 7.327f, 4.673f, 8f, 5.5f, 8f)
                close()
                moveTo(5f, 3.5f)
                curveTo(5f, 3.224f, 5.224f, 3f, 5.5f, 3f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 3f, 11f, 3.224f, 11f, 3.5f)
                verticalLineTo(6.5f)
                curveTo(11f, 6.776f, 10.776f, 7f, 10.5f, 7f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(5.75f, 5f)
                curveTo(5.75f, 4.586f, 6.086f, 4.25f, 6.5f, 4.25f)
                curveTo(6.914f, 4.25f, 7.25f, 4.586f, 7.25f, 5f)
                curveTo(7.25f, 5.414f, 6.914f, 5.75f, 6.5f, 5.75f)
                curveTo(6.086f, 5.75f, 5.75f, 5.414f, 5.75f, 5f)
                close()
                moveTo(8.75f, 5f)
                curveTo(8.75f, 4.586f, 9.086f, 4.25f, 9.5f, 4.25f)
                curveTo(9.914f, 4.25f, 10.25f, 4.586f, 10.25f, 5f)
                curveTo(10.25f, 5.414f, 9.914f, 5.75f, 9.5f, 5.75f)
                curveTo(9.086f, 5.75f, 8.75f, 5.414f, 8.75f, 5f)
                close()
            }
        }.build()
        
        return _Robot!!
    }

private var _Robot: ImageVector? = null

