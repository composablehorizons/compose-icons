package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pets: ImageVector
    get() {
        if (_Pets != null) return _Pets!!
        
        _Pets = ImageVector.Builder(
            name = "pets",
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
                moveTo(7f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 7f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9f, 8f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6.5f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 11.5f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.5f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 15f, 8f)
                arcTo(2.5f, 2.5f, 0f, false, true, 12.5f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 17.5f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 19.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 17f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 22f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.34f, 14.86f)
                curveToRelative(-0.87f, -1.02f, -1.6f, -1.89f, -2.48f, -2.91f)
                curveToRelative(-0.46f, -0.54f, -1.05f, -1.08f, -1.75f, -1.32f)
                curveToRelative(-0.11f, -0.04f, -0.22f, -0.07f, -0.33f, -0.09f)
                curveToRelative(-0.25f, -0.04f, -0.52f, -0.04f, -0.78f, -0.04f)
                reflectiveCurveToRelative(-0.53f, 0f, -0.79f, 0.05f)
                curveToRelative(-0.11f, 0.02f, -0.22f, 0.05f, -0.33f, 0.09f)
                curveToRelative(-0.7f, 0.24f, -1.28f, 0.78f, -1.75f, 1.32f)
                curveToRelative(-0.87f, 1.02f, -1.6f, 1.89f, -2.48f, 2.91f)
                curveToRelative(-1.31f, 1.31f, -2.92f, 2.76f, -2.62f, 4.79f)
                curveToRelative(0.29f, 1.02f, 1.02f, 2.03f, 2.33f, 2.32f)
                curveToRelative(0.73f, 0.15f, 3.06f, -0.44f, 5.54f, -0.44f)
                horizontalLineToRelative(0.18f)
                curveToRelative(2.48f, 0f, 4.81f, 0.58f, 5.54f, 0.44f)
                curveToRelative(1.31f, -0.29f, 2.04f, -1.31f, 2.33f, -2.32f)
                curveToRelative(0.31f, -2.04f, -1.3f, -3.49f, -2.61f, -4.8f)
                close()
            }
        }.build()
        
        return _Pets!!
    }

private var _Pets: ImageVector? = null

