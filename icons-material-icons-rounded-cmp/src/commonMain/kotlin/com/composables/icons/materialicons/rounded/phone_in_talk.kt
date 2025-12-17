package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Phone_in_talk: ImageVector
    get() {
        if (_Phone_in_talk != null) return _Phone_in_talk!!
        
        _Phone_in_talk = ImageVector.Builder(
            name = "phone_in_talk",
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
                moveTo(12.88f, 5.05f)
                curveToRelative(3.18f, 0.4f, 5.67f, 2.89f, 6.07f, 6.07f)
                curveToRelative(0.06f, 0.51f, 0.49f, 0.88f, 0.99f, 0.88f)
                curveToRelative(0.04f, 0f, 0.08f, 0f, 0.12f, -0.01f)
                curveToRelative(0.55f, -0.07f, 0.94f, -0.57f, 0.87f, -1.12f)
                curveToRelative(-0.51f, -4.09f, -3.72f, -7.3f, -7.81f, -7.81f)
                curveToRelative(-0.55f, -0.06f, -1.05f, 0.33f, -1.11f, 0.88f)
                curveToRelative(-0.07f, 0.55f, 0.32f, 1.05f, 0.87f, 1.11f)
                close()
                moveToRelative(0.38f, 2.11f)
                curveToRelative(-0.53f, -0.14f, -1.08f, 0.18f, -1.22f, 0.72f)
                reflectiveCurveToRelative(0.18f, 1.08f, 0.72f, 1.22f)
                curveToRelative(1.05f, 0.27f, 1.87f, 1.09f, 2.15f, 2.15f)
                curveToRelative(0.12f, 0.45f, 0.52f, 0.75f, 0.97f, 0.75f)
                curveToRelative(0.08f, 0f, 0.17f, -0.01f, 0.25f, -0.03f)
                curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.72f, -1.22f)
                curveToRelative(-0.47f, -1.77f, -1.84f, -3.14f, -3.59f, -3.59f)
                close()
                moveToRelative(5.97f, 8.1f)
                lineToRelative(-2.54f, -0.29f)
                curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f)
                lineToRelative(-1.84f, 1.84f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(1.85f, -1.85f)
                curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f)
                lineToRelative(-0.29f, -2.52f)
                curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f)
                horizontalLineTo(5.03f)
                curveToRelative(-1.13f, 0f, -2.07f, 0.94f, -2f, 2.07f)
                curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f)
                curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2f)
                verticalLineToRelative(-1.73f)
                curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f)
                close()
            }
        }.build()
        
        return _Phone_in_talk!!
    }

private var _Phone_in_talk: ImageVector? = null

