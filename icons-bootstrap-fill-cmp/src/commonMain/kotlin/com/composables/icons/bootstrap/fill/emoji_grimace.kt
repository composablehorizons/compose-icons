package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiGrimace: ImageVector
    get() {
        if (_EmojiGrimace != null) return _EmojiGrimace!!
        
        _EmojiGrimace = ImageVector.Builder(
            name = "emoji-grimace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(7f, 6.25f)
                curveTo(7f, 5.56f, 6.552f, 5f, 6f, 5f)
                reflectiveCurveToRelative(-1f, 0.56f, -1f, 1.25f)
                reflectiveCurveToRelative(0.448f, 1.25f, 1f, 1.25f)
                reflectiveCurveToRelative(1f, -0.56f, 1f, -1.25f)
                moveToRelative(3f, 1.25f)
                curveToRelative(0.552f, 0f, 1f, -0.56f, 1f, -1.25f)
                reflectiveCurveTo(10.552f, 5f, 10f, 5f)
                reflectiveCurveToRelative(-1f, 0.56f, -1f, 1.25f)
                reflectiveCurveToRelative(0.448f, 1.25f, 1f, 1.25f)
                moveToRelative(1.5f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.48f, -1.25f)
                verticalLineToRelative(-0.003f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -0.497f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.5f, 9f)
                horizontalLineToRelative(-7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.48f, 1.25f)
                verticalLineToRelative(0.003f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 0.497f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 12f)
                close()
                moveToRelative(-7.969f, -1.25f)
                arcToRelative(1f, 1f, 0f, false, false, 0.969f, 0.75f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(-0.75f)
                close()
                moveToRelative(8.938f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -0.969f, 0.75f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(11.5f, 9.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.969f, 0.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(9.5f)
                close()
                moveToRelative(-7.969f, 0.75f)
                arcTo(1f, 1f, 0f, false, true, 4.5f, 9.5f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(0.75f)
                close()
                moveTo(5.25f, 11.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(2.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(1.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(1.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-1f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _EmojiGrimace!!
    }

private var _EmojiGrimace: ImageVector? = null

