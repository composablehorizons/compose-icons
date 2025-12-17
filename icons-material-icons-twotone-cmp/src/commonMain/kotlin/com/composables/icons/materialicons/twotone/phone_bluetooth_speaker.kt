package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Phone_bluetooth_speaker: ImageVector
    get() {
        if (_Phone_bluetooth_speaker != null) return _Phone_bluetooth_speaker!!
        
        _Phone_bluetooth_speaker = ImageVector.Builder(
            name = "phone_bluetooth_speaker",
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
                curveToRelative(1.21f, 0.41f, 2.48f, 0.67f, 3.8f, 0.76f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-0.88f, -0.07f, -1.75f, -0.22f, -2.6f, -0.45f)
                lineToRelative(-1.2f, 1.19f)
                close()
                moveTo(6.54f, 5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0.09f, 1.32f, 0.34f, 2.58f, 0.75f, 3.79f)
                lineToRelative(1.2f, -1.21f)
                curveToRelative(-0.24f, -0.83f, -0.39f, -1.7f, -0.45f, -2.58f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 15.5f)
                curveToRelative(-1.25f, 0f, -2.45f, -0.2f, -3.57f, -0.57f)
                curveToRelative(-0.1f, -0.03f, -0.21f, -0.05f, -0.31f, -0.05f)
                curveToRelative(-0.26f, 0f, -0.51f, 0.1f, -0.71f, 0.29f)
                lineToRelative(-2.2f, 2.2f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.2f, -2.21f)
                curveToRelative(0.28f, -0.26f, 0.36f, -0.65f, 0.25f, -1f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 9.39f, 7.61f, 17f, 17f, 17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(5.03f, 5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.07f, 0.88f, 0.22f, 1.75f, 0.45f, 2.58f)
                lineToRelative(-1.2f, 1.21f)
                curveToRelative(-0.4f, -1.21f, -0.66f, -2.47f, -0.75f, -3.79f)
                close()
                moveTo(19f, 18.97f)
                curveToRelative(-1.32f, -0.09f, -2.6f, -0.35f, -3.8f, -0.76f)
                lineToRelative(1.2f, -1.2f)
                curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f)
                verticalLineToRelative(1.51f)
                close()
                moveTo(14.71f, 9.5f)
                lineTo(17f, 7.21f)
                verticalLineTo(11f)
                horizontalLineToRelative(0.5f)
                lineToRelative(2.85f, -2.85f)
                lineTo(18.21f, 6f)
                lineToRelative(2.15f, -2.15f)
                lineTo(17.5f, 1f)
                horizontalLineTo(17f)
                verticalLineToRelative(3.79f)
                lineTo(14.71f, 2.5f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(16.79f, 6f)
                lineTo(14f, 8.79f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(18f, 2.91f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                verticalLineTo(2.91f)
                close()
                moveToRelative(0f, 4.3f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                verticalLineTo(7.21f)
                close()
            }
        }.build()
        
        return _Phone_bluetooth_speaker!!
    }

private var _Phone_bluetooth_speaker: ImageVector? = null

