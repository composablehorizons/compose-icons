package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Portrait: ImageVector
    get() {
        if (_Portrait != null) return _Portrait!!
        
        _Portrait = ImageVector.Builder(
            name = "portrait",
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
                moveTo(12f, 12.25f)
                curveToRelative(1.24f, 0f, 2.25f, -1.01f, 2.25f, -2.25f)
                reflectiveCurveTo(13.24f, 7.75f, 12f, 7.75f)
                reflectiveCurveTo(9.75f, 8.76f, 9.75f, 10f)
                reflectiveCurveToRelative(1.01f, 2.25f, 2.25f, 2.25f)
                close()
                moveToRelative(4.5f, 4f)
                curveToRelative(0f, -1.5f, -3f, -2.25f, -4.5f, -2.25f)
                reflectiveCurveToRelative(-4.5f, 0.75f, -4.5f, 2.25f)
                verticalLineTo(17f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Portrait!!
    }

private var _Portrait: ImageVector? = null

