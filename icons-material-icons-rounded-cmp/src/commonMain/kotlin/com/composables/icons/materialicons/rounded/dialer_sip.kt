package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Dialer_sip: ImageVector
    get() {
        if (_Dialer_sip != null) return _Dialer_sip!!
        
        _Dialer_sip = ImageVector.Builder(
            name = "dialer_sip",
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
                moveTo(16.5f, 8f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveToRelative(-4f, -1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.3f, 0f, 0.55f, -0.25f, 0.55f, -0.55f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -0.3f, -0.25f, -0.55f, -0.55f, -0.55f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(-0.3f, 0f, -0.55f, 0.25f, -0.55f, 0.55f)
                verticalLineToRelative(1.89f)
                curveToRelative(0f, 0.31f, 0.25f, 0.56f, 0.55f, 0.56f)
                horizontalLineTo(14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                close()
                moveToRelative(7.95f, -4f)
                horizontalLineToRelative(-1.89f)
                curveToRelative(-0.31f, 0f, -0.56f, 0.25f, -0.56f, 0.55f)
                verticalLineTo(7.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(6f)
                horizontalLineToRelative(1.45f)
                curveToRelative(0.3f, 0f, 0.55f, -0.25f, 0.55f, -0.55f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -0.3f, -0.25f, -0.55f, -0.55f, -0.55f)
                close()
                moveTo(20f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(-0.79f, 10.27f)
                lineToRelative(-2.54f, -0.29f)
                curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f)
                lineToRelative(-1.84f, 1.84f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(1.85f, -1.85f)
                curveToRelative(0.43f, -0.43f, 0.64f, -1.04f, 0.57f, -1.64f)
                lineToRelative(-0.29f, -2.52f)
                curveToRelative(-0.11f, -1.01f, -0.97f, -1.78f, -1.98f, -1.78f)
                horizontalLineTo(5.02f)
                curveToRelative(-1.13f, 0f, -2.07f, 0.94f, -2f, 2.07f)
                curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f)
                curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2f)
                verticalLineToRelative(-1.73f)
                curveToRelative(0.01f, -1f, -0.76f, -1.86f, -1.77f, -1.97f)
                close()
            }
        }.build()
        
        return _Dialer_sip!!
    }

private var _Dialer_sip: ImageVector? = null

