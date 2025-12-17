package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Perm_phone_msg: ImageVector
    get() {
        if (_Perm_phone_msg != null) return _Perm_phone_msg!!
        
        _Perm_phone_msg = ImageVector.Builder(
            name = "perm_phone_msg",
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
                moveTo(20f, 3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveToRelative(-0.77f, 12.26f)
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
        
        return _Perm_phone_msg!!
    }

private var _Perm_phone_msg: ImageVector? = null

