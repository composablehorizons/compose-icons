package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Night_shelter: ImageVector
    get() {
        if (_Night_shelter != null) return _Night_shelter!!
        
        _Night_shelter = ImageVector.Builder(
            name = "night_shelter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.8f, 3.9f)
                lineToRelative(-6f, 4.5f)
                curveTo(4.3f, 8.78f, 4f, 9.37f, 4f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                lineToRelative(-6f, -4.5f)
                curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f)
                close()
                moveTo(9.75f, 12.5f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveTo(10.44f, 15f, 9.75f, 15f)
                reflectiveCurveTo(8.5f, 14.44f, 8.5f, 13.75f)
                reflectiveCurveTo(9.06f, 12.5f, 9.75f, 12.5f)
                close()
                moveTo(16.5f, 18f)
                lineTo(16.5f, 18f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                curveTo(8f, 17.78f, 7.78f, 18f, 7.5f, 18f)
                horizontalLineToRelative(0f)
                curveTo(7.22f, 18f, 7f, 17.78f, 7f, 17.5f)
                verticalLineToRelative(-6f)
                curveTo(7f, 11.22f, 7.22f, 11f, 7.5f, 11f)
                horizontalLineToRelative(0f)
                curveTo(7.78f, 11f, 8f, 11.22f, 8f, 11.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3.5f)
                curveTo(17f, 17.78f, 16.78f, 18f, 16.5f, 18f)
                close()
            }
        }.build()
        
        return _Night_shelter!!
    }

private var _Night_shelter: ImageVector? = null

