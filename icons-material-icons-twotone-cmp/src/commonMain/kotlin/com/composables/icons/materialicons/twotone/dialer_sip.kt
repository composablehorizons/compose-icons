package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Dialer_sip: ImageVector
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
                moveTo(15.2f, 18.21f)
                curveToRelative(1.2f, 0.41f, 2.48f, 0.67f, 3.8f, 0.75f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-0.88f, -0.06f, -1.75f, -0.22f, -2.59f, -0.45f)
                lineToRelative(-1.21f, 1.2f)
                close()
                moveTo(6.54f, 5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0.09f, 1.32f, 0.35f, 2.59f, 0.75f, 3.79f)
                lineToRelative(1.2f, -1.21f)
                curveToRelative(-0.24f, -0.83f, -0.39f, -1.7f, -0.45f, -2.58f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(9f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(-1f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(1f, 11.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-1.25f, 0f, -2.45f, -0.2f, -3.57f, -0.57f)
                curveToRelative(-0.1f, -0.03f, -0.21f, -0.05f, -0.31f, -0.05f)
                curveToRelative(-0.26f, 0f, -0.51f, 0.1f, -0.7f, 0.29f)
                lineToRelative(-2.2f, 2.2f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.2f, -2.21f)
                curveToRelative(0.27f, -0.26f, 0.35f, -0.65f, 0.24f, -1f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 9.39f, 7.61f, 17f, 17f, 17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(5.03f, 5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.07f, 0.88f, 0.22f, 1.75f, 0.46f, 2.59f)
                lineTo(5.79f, 8.8f)
                curveToRelative(-0.41f, -1.21f, -0.67f, -2.48f, -0.76f, -3.8f)
                close()
                moveTo(19f, 18.97f)
                curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f)
                lineToRelative(1.2f, -1.2f)
                curveToRelative(0.85f, 0.24f, 1.71f, 0.39f, 2.59f, 0.45f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.build()
        
        return _Dialer_sip!!
    }

private var _Dialer_sip: ImageVector? = null

