package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Insert_link: ImageVector
    get() {
        if (_Insert_link != null) return _Insert_link!!
        
        _Insert_link = ImageVector.Builder(
            name = "insert_link",
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
                moveTo(3.96f, 11.38f)
                curveTo(4.24f, 9.91f, 5.62f, 8.9f, 7.12f, 8.9f)
                horizontalLineToRelative(2.93f)
                curveToRelative(0.52f, 0f, 0.95f, -0.43f, 0.95f, -0.95f)
                reflectiveCurveTo(10.57f, 7f, 10.05f, 7f)
                horizontalLineTo(7.22f)
                curveToRelative(-2.61f, 0f, -4.94f, 1.91f, -5.19f, 4.51f)
                curveTo(1.74f, 14.49f, 4.08f, 17f, 7f, 17f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.52f, 0f, 0.95f, -0.43f, 0.95f, -0.95f)
                reflectiveCurveToRelative(-0.43f, -0.95f, -0.95f, -0.95f)
                horizontalLineTo(7f)
                curveToRelative(-1.91f, 0f, -3.42f, -1.74f, -3.04f, -3.72f)
                close()
                moveTo(9f, 13f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveToRelative(7.78f, -6f)
                horizontalLineToRelative(-2.83f)
                curveToRelative(-0.52f, 0f, -0.95f, 0.43f, -0.95f, 0.95f)
                reflectiveCurveToRelative(0.43f, 0.95f, 0.95f, 0.95f)
                horizontalLineToRelative(2.93f)
                curveToRelative(1.5f, 0f, 2.88f, 1.01f, 3.16f, 2.48f)
                curveToRelative(0.38f, 1.98f, -1.13f, 3.72f, -3.04f, 3.72f)
                horizontalLineToRelative(-3.05f)
                curveToRelative(-0.52f, 0f, -0.95f, 0.43f, -0.95f, 0.95f)
                reflectiveCurveToRelative(0.43f, 0.95f, 0.95f, 0.95f)
                horizontalLineTo(17f)
                curveToRelative(2.92f, 0f, 5.26f, -2.51f, 4.98f, -5.49f)
                curveToRelative(-0.25f, -2.6f, -2.59f, -4.51f, -5.2f, -4.51f)
                close()
            }
        }.build()
        
        return _Insert_link!!
    }

private var _Insert_link: ImageVector? = null

