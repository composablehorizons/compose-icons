package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Accessible_forward: ImageVector
    get() {
        if (_Accessible_forward != null) return _Accessible_forward!!
        
        _Accessible_forward = ImageVector.Builder(
            name = "accessible_forward",
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
                moveTo(20f, 4.54f)
                arcTo(2f, 2f, 0f, false, true, 18f, 6.54f)
                arcTo(2f, 2f, 0f, false, true, 16f, 4.54f)
                arcTo(2f, 2f, 0f, false, true, 20f, 4.54f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 17f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveToRelative(3f, -3.5f)
                horizontalLineToRelative(-1.86f)
                lineToRelative(1.67f, -3.67f)
                curveTo(18.42f, 8.5f, 17.44f, 7f, 15.96f, 7f)
                horizontalLineToRelative(-5.2f)
                curveToRelative(-0.81f, 0f, -1.54f, 0.47f, -1.87f, 1.2f)
                lineToRelative(-0.28f, 0.76f)
                curveToRelative(-0.21f, 0.56f, 0.11f, 1.17f, 0.68f, 1.33f)
                curveToRelative(0.49f, 0.14f, 1f, -0.11f, 1.2f, -0.58f)
                lineToRelative(0.3f, -0.71f)
                horizontalLineTo(13f)
                lineToRelative(-1.83f, 4.1f)
                curveToRelative(-0.6f, 1.33f, 0.39f, 2.9f, 1.85f, 2.9f)
                horizontalLineTo(18f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Accessible_forward!!
    }

private var _Accessible_forward: ImageVector? = null

