package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Inbox: ImageVector
    get() {
        if (_Inbox != null) return _Inbox!!
        
        _Inbox = ImageVector.Builder(
            name = "inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.912f, 3f)
                arcToRelative(3f, 3f, 0f, false, false, -2.868f, 2.118f)
                lineToRelative(-2.411f, 7.838f)
                arcToRelative(3f, 3f, 0f, false, false, -0.133f, 0.882f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-4.162f)
                curveToRelative(0f, -0.299f, -0.045f, -0.596f, -0.133f, -0.882f)
                lineToRelative(-2.412f, -7.838f)
                arcTo(3f, 3f, 0f, false, false, 17.088f, 3f)
                horizontalLineTo(6.912f)
                close()
                moveToRelative(13.823f, 9.75f)
                lineToRelative(-2.213f, -7.191f)
                arcTo(1.5f, 1.5f, 0f, false, false, 17.088f, 4.5f)
                horizontalLineTo(6.912f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.434f, 1.059f)
                lineTo(3.265f, 12.75f)
                horizontalLineTo(6.11f)
                arcToRelative(3f, 3f, 0f, false, true, 2.684f, 1.658f)
                lineToRelative(0.256f, 0.513f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.342f, 0.829f)
                horizontalLineToRelative(3.218f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.342f, -0.83f)
                lineToRelative(0.256f, -0.512f)
                arcToRelative(3f, 3f, 0f, false, true, 2.684f, -1.658f)
                horizontalLineToRelative(2.844f)
                close()
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null

