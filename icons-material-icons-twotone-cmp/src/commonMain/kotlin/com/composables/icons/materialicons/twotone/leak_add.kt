package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Leak_add: ImageVector
    get() {
        if (_Leak_add != null) return _Leak_add!!
        
        _Leak_add = ImageVector.Builder(
            name = "leak_add",
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
                moveTo(18f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveTo(3f, 14f)
                curveToRelative(6.08f, 0f, 11f, -4.93f, 11f, -11f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 4.97f, -4.03f, 9f, -9f, 9f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(11f, 7f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                verticalLineToRelative(-2f)
                curveToRelative(-3.87f, 0f, -7f, 3.13f, -7f, 7f)
                close()
                moveTo(3f, 10f)
                curveToRelative(3.87f, 0f, 7f, -3.13f, 7f, -7f)
                horizontalLineTo(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(7f, 11f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
                verticalLineToRelative(-2f)
                curveToRelative(-6.07f, 0f, -11f, 4.93f, -11f, 11f)
                close()
                moveTo(3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Leak_add!!
    }

private var _Leak_add: ImageVector? = null

