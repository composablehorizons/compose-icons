package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phonelink_setup: ImageVector
    get() {
        if (_Phonelink_setup != null) return _Phonelink_setup!!
        
        _Phonelink_setup = ImageVector.Builder(
            name = "phonelink_setup",
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
                moveTo(7f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(16f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(14f)
                verticalLineTo(1f)
                close()
                moveToRelative(2.5f, 14.5f)
                curveToRelative(0.29f, -0.12f, 0.55f, -0.29f, 0.8f, -0.48f)
                lineToRelative(-0.02f, 0.03f)
                lineToRelative(1.41f, 0.55f)
                lineToRelative(1.27f, -2.2f)
                lineToRelative(-1.18f, -0.95f)
                lineToRelative(-0.02f, 0.03f)
                curveToRelative(0.02f, -0.16f, 0.05f, -0.32f, 0.05f, -0.48f)
                reflectiveCurveToRelative(-0.03f, -0.32f, -0.05f, -0.48f)
                lineToRelative(0.02f, 0.03f)
                lineToRelative(1.18f, -0.95f)
                lineToRelative(-1.26f, -2.2f)
                lineToRelative(-1.41f, 0.55f)
                lineToRelative(0.02f, 0.03f)
                curveToRelative(-0.26f, -0.19f, -0.52f, -0.36f, -0.81f, -0.48f)
                lineTo(9.27f, 7f)
                horizontalLineTo(6.73f)
                lineTo(6.5f, 8.5f)
                curveToRelative(-0.29f, 0.12f, -0.55f, 0.29f, -0.8f, 0.48f)
                lineToRelative(0.02f, -0.03f)
                lineTo(4.3f, 8.4f)
                lineToRelative(-1.27f, 2.2f)
                lineToRelative(1.18f, 0.95f)
                lineToRelative(0.02f, -0.03f)
                curveToRelative(-0.01f, 0.16f, -0.04f, 0.32f, -0.04f, 0.48f)
                reflectiveCurveToRelative(0.03f, 0.32f, 0.05f, 0.48f)
                lineToRelative(-0.02f, -0.03f)
                lineToRelative(-1.18f, 0.95f)
                lineToRelative(1.27f, 2.2f)
                lineToRelative(1.41f, -0.55f)
                lineToRelative(-0.02f, -0.03f)
                curveToRelative(0.25f, 0.19f, 0.51f, 0.36f, 0.8f, 0.48f)
                lineToRelative(0.23f, 1.5f)
                horizontalLineToRelative(2.54f)
                lineToRelative(0.23f, -1.5f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Phonelink_setup!!
    }

private var _Phonelink_setup: ImageVector? = null

