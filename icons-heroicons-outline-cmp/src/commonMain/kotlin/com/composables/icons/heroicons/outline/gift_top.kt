package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.GiftTop: ImageVector
    get() {
        if (_GiftTop != null) return _GiftTop!!
        
        _GiftTop = ImageVector.Builder(
            name = "gift-top",
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
                moveTo(12f, 3.75f)
                verticalLineToRelative(16.5f)
                moveTo(2.25f, 12f)
                horizontalLineToRelative(19.5f)
                moveTo(6.375f, 17.25f)
                arcToRelative(4.875f, 4.875f, 0f, false, false, 4.875f, -4.875f)
                verticalLineTo(12f)
                moveToRelative(6.375f, 5.25f)
                arcToRelative(4.875f, 4.875f, 0f, false, true, -4.875f, -4.875f)
                verticalLineTo(12f)
                moveToRelative(-9f, 8.25f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(5.25f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineTo(3.75f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                close()
                moveToRelative(12.621f, -9.44f)
                curveToRelative(-1.409f, 1.41f, -4.242f, 1.061f, -4.242f, 1.061f)
                reflectiveCurveToRelative(-0.349f, -2.833f, 1.06f, -4.242f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 3.182f, 3.182f)
                close()
                moveTo(10.773f, 7.63f)
                curveToRelative(1.409f, 1.409f, 1.06f, 4.242f, 1.06f, 4.242f)
                reflectiveCurveTo(9f, 12.22f, 7.592f, 10.811f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, 3.182f, -3.182f)
                close()
            }
        }.build()
        
        return _GiftTop!!
    }

private var _GiftTop: ImageVector? = null

