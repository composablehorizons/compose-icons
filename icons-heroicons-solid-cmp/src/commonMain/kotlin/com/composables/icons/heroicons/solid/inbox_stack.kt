package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.InboxStack: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 9.832f)
                verticalLineToRelative(1.793f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(17.25f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineTo(9.832f)
                arcToRelative(3f, 3f, 0f, false, false, -0.722f, -1.952f)
                lineToRelative(-3.285f, -3.832f)
                arcTo(3f, 3f, 0f, false, false, 16.215f, 3f)
                horizontalLineToRelative(-8.43f)
                arcToRelative(3f, 3f, 0f, false, false, -2.278f, 1.048f)
                lineTo(2.222f, 7.88f)
                arcTo(3f, 3f, 0f, false, false, 1.5f, 9.832f)
                close()
                moveTo(7.785f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.139f, 0.524f)
                lineTo(3.881f, 8.25f)
                horizontalLineToRelative(3.165f)
                arcToRelative(3f, 3f, 0f, false, true, 2.496f, 1.336f)
                lineToRelative(0.164f, 0.246f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.248f, 0.668f)
                horizontalLineToRelative(2.092f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.248f, -0.668f)
                lineToRelative(0.164f, -0.246f)
                arcToRelative(3f, 3f, 0f, false, true, 2.496f, -1.336f)
                horizontalLineToRelative(3.165f)
                lineToRelative(-2.765f, -3.226f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.139f, -0.524f)
                horizontalLineToRelative(-8.43f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.813f, 15f)
                curveToRelative(-0.725f, 0f, -1.313f, 0.588f, -1.313f, 1.313f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-1.688f)
                curveToRelative(0f, -0.724f, -0.588f, -1.312f, -1.313f, -1.312f)
                horizontalLineToRelative(-4.233f)
                arcToRelative(3f, 3f, 0f, false, false, -2.496f, 1.336f)
                lineToRelative(-0.164f, 0.246f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.248f, 0.668f)
                horizontalLineToRelative(-2.092f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.248f, -0.668f)
                lineToRelative(-0.164f, -0.246f)
                arcTo(3f, 3f, 0f, false, false, 7.046f, 15f)
                horizontalLineTo(2.812f)
                close()
            }
        }.build()
        
        return _InboxStack!!
    }

private var _InboxStack: ImageVector? = null

