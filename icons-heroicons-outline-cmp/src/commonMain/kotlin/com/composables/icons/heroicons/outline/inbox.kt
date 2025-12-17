package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Inbox: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(2.25f, 13.5f)
                horizontalLineToRelative(3.86f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.012f, 1.244f)
                lineToRelative(0.256f, 0.512f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.013f, 1.244f)
                horizontalLineToRelative(3.218f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.013f, -1.244f)
                lineToRelative(0.256f, -0.512f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.013f, -1.244f)
                horizontalLineToRelative(3.859f)
                moveToRelative(-19.5f, 0.338f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(15f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21.75f, 18f)
                verticalLineToRelative(-4.162f)
                curveToRelative(0f, -0.224f, -0.034f, -0.447f, -0.1f, -0.661f)
                lineTo(19.24f, 5.338f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.15f, -1.588f)
                horizontalLineTo(6.911f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.15f, 1.588f)
                lineTo(2.35f, 13.177f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -0.1f, 0.661f)
                close()
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null

