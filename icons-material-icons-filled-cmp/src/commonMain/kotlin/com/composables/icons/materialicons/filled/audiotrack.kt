package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Audiotrack: ImageVector
    get() {
        if (_Audiotrack != null) return _Audiotrack!!
        
        _Audiotrack = ImageVector.Builder(
            name = "audiotrack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(9.28f)
                curveToRelative(-0.47f, -0.17f, -0.97f, -0.28f, -1.5f, -0.28f)
                curveTo(8.01f, 12f, 6f, 14.01f, 6f, 16.5f)
                reflectiveCurveTo(8.01f, 21f, 10.5f, 21f)
                curveToRelative(2.31f, 0f, 4.2f, -1.75f, 4.45f, -4f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineToRelative(4f)
                verticalLineTo(3f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.build()
        
        return _Audiotrack!!
    }

private var _Audiotrack: ImageVector? = null

