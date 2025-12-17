package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Phone_in_talk: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 15.5f)
                curveToRelative(-1.25f, 0f, -2.45f, -0.2f, -3.57f, -0.57f)
                curveToRelative(-0.35f, -0.11f, -0.74f, -0.03f, -1.02f, 0.24f)
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
                moveTo(19f, 12f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                verticalLineToRelative(2f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                close()
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                verticalLineToRelative(2f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
            }
        }.build()
        
        return _Phone_in_talk!!
    }

private var _Phone_in_talk: ImageVector? = null

