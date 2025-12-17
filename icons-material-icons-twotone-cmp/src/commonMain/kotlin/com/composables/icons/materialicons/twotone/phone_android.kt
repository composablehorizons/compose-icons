package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Phone_android: ImageVector
    get() {
        if (_Phone_android != null) return _Phone_android!!
        
        _Phone_android = ImageVector.Builder(
            name = "phone_android",
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
                moveTo(7f, 4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                horizontalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 1f)
                horizontalLineTo(8f)
                curveTo(6.34f, 1f, 5f, 2.34f, 5f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveToRelative(-2f, 20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(3f, -3f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Phone_android!!
    }

private var _Phone_android: ImageVector? = null

