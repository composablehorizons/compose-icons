package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Library_music: ImageVector
    get() {
        if (_Library_music != null) return _Library_music!!
        
        _Library_music = ImageVector.Builder(
            name = "library_music",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 2f)
                horizontalLineTo(6f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveToRelative(-4f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(10f, 13.88f, 10f, 12.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.57f, 0f, 1.08f, 0.19f, 1.5f, 0.51f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Library_music!!
    }

private var _Library_music: ImageVector? = null

