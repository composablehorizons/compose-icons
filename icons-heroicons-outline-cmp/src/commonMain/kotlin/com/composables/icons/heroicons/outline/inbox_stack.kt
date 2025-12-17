package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.InboxStack: ImageVector
    get() {
        if (_InboxStack != null) return _InboxStack!!
        
        _InboxStack = ImageVector.Builder(
            name = "inbox-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(7.875f, 14.25f)
                lineToRelative(1.214f, 1.942f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 1.908f, 1.058f)
                horizontalLineToRelative(2.006f)
                curveToRelative(0.776f, 0f, 1.497f, -0.4f, 1.908f, -1.058f)
                lineToRelative(1.214f, -1.942f)
                moveTo(2.41f, 9f)
                horizontalLineToRelative(4.636f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 1.872f, 1.002f)
                lineToRelative(0.164f, 0.246f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 1.872f, 1.002f)
                horizontalLineToRelative(2.092f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 1.872f, -1.002f)
                lineToRelative(0.164f, -0.246f)
                arcTo(2.25f, 2.25f, 0f, false, true, 16.954f, 9f)
                horizontalLineToRelative(4.636f)
                moveTo(2.41f, 9f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -0.16f, 0.832f)
                verticalLineTo(12f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(15f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21.75f, 12f)
                verticalLineTo(9.832f)
                curveToRelative(0f, -0.287f, -0.055f, -0.57f, -0.16f, -0.832f)
                moveTo(2.41f, 9f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 0.382f, -0.632f)
                lineToRelative(3.285f, -3.832f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 1.708f, -0.786f)
                horizontalLineToRelative(8.43f)
                curveToRelative(0.657f, 0f, 1.281f, 0.287f, 1.709f, 0.786f)
                lineToRelative(3.284f, 3.832f)
                curveToRelative(0.163f, 0.19f, 0.291f, 0.404f, 0.382f, 0.632f)
                moveTo(4.5f, 20.25f)
                horizontalLineToRelative(15f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21.75f, 18f)
                verticalLineToRelative(-2.625f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(3.375f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                close()
            }
        }.build()
        
        return _InboxStack!!
    }

private var _InboxStack: ImageVector? = null

