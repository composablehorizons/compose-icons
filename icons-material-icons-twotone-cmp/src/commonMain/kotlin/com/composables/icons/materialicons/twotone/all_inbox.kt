package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.All_inbox: ImageVector
    get() {
        if (_All_inbox != null) return _All_inbox!!
        
        _All_inbox = ImageVector.Builder(
            name = "all_inbox",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(3.13f)
                curveToRelative(0.21f, 0.78f, 0.67f, 1.47f, 1.27f, 2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(14f, 2f)
                horizontalLineToRelative(-4.4f)
                curveToRelative(0.6f, -0.53f, 1.06f, -1.22f, 1.27f, -2f)
                horizontalLineTo(19f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.07f, -0.93f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.93f, -2f, -2f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(-5f, 7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.47f, -0.19f, 0.9f, -0.48f, 1.25f)
                curveToRelative(-0.37f, 0.45f, -0.92f, 0.75f, -1.52f, 0.75f)
                reflectiveCurveToRelative(-1.15f, -0.3f, -1.52f, -0.75f)
                curveToRelative(-0.29f, -0.35f, -0.48f, -0.78f, -0.48f, -1.25f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-7f)
                close()
                moveToRelative(-9f, 2f)
                horizontalLineToRelative(3.13f)
                curveToRelative(0.02f, 0.09f, 0.06f, 0.17f, 0.09f, 0.25f)
                curveToRelative(0.24f, 0.68f, 0.65f, 1.28f, 1.18f, 1.75f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(14f, 2f)
                horizontalLineToRelative(-4.4f)
                curveToRelative(0.54f, -0.47f, 0.95f, -1.07f, 1.18f, -1.75f)
                curveToRelative(0.03f, -0.08f, 0.07f, -0.16f, 0.09f, -0.25f)
                horizontalLineTo(19f)
                verticalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.13f, 10f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.4f)
                curveToRelative(-0.6f, -0.53f, -1.06f, -1.22f, -1.27f, -2f)
                close()
                moveToRelative(6.47f, 2f)
                horizontalLineTo(19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(-0.21f, 0.78f, -0.67f, 1.47f, -1.27f, 2f)
                close()
                moveToRelative(-6.38f, 5.25f)
                curveToRelative(-0.03f, -0.08f, -0.06f, -0.16f, -0.09f, -0.25f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.4f)
                curveToRelative(-0.53f, -0.47f, -0.94f, -1.07f, -1.18f, -1.75f)
                close()
                moveToRelative(7.65f, -0.25f)
                curveToRelative(-0.02f, 0.09f, -0.06f, 0.17f, -0.09f, 0.25f)
                curveToRelative(-0.23f, 0.68f, -0.64f, 1.28f, -1.18f, 1.75f)
                horizontalLineTo(19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.13f)
                close()
            }
        }.build()
        
        return _All_inbox!!
    }

private var _All_inbox: ImageVector? = null

