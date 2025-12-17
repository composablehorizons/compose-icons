package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.InboxArrowDown: ImageVector
    get() {
        if (_InboxArrowDown != null) return _InboxArrowDown!!
        
        _InboxArrowDown = ImageVector.Builder(
            name = "inbox-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.478f, 5.559f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.912f, 4.5f)
                horizontalLineTo(9f)
                arcTo(0.75f, 0.75f, 0f, false, false, 9f, 3f)
                horizontalLineTo(6.912f)
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
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.088f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.434f, 1.059f)
                lineToRelative(2.213f, 7.191f)
                horizontalLineTo(17.89f)
                arcToRelative(3f, 3f, 0f, false, false, -2.684f, 1.658f)
                lineToRelative(-0.256f, 0.513f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.342f, 0.829f)
                horizontalLineToRelative(-3.218f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.342f, -0.83f)
                lineToRelative(-0.256f, -0.512f)
                arcToRelative(3f, 3f, 0f, false, false, -2.684f, -1.658f)
                horizontalLineTo(3.265f)
                lineToRelative(2.213f, -7.191f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.44f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(1.72f, 1.72f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _InboxArrowDown!!
    }

private var _InboxArrowDown: ImageVector? = null

