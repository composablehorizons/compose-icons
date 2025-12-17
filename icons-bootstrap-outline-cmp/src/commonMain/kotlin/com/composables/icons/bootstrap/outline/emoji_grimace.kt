package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EmojiGrimace: ImageVector
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
                moveTo(7f, 6.25f)
                curveToRelative(0f, 0.69f, -0.448f, 1.25f, -1f, 1.25f)
                reflectiveCurveToRelative(-1f, -0.56f, -1f, -1.25f)
                reflectiveCurveTo(5.448f, 5f, 6f, 5f)
                reflectiveCurveToRelative(1f, 0.56f, 1f, 1.25f)
                moveToRelative(3f, 1.25f)
                curveToRelative(0.552f, 0f, 1f, -0.56f, 1f, -1.25f)
                reflectiveCurveTo(10.552f, 5f, 10f, 5f)
                reflectiveCurveToRelative(-1f, 0.56f, -1f, 1.25f)
                reflectiveCurveToRelative(0.448f, 1.25f, 1f, 1.25f)
                moveToRelative(2.98f, 3.25f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 12f)
                horizontalLineToRelative(-7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.48f, -1.747f)
                verticalLineToRelative(-0.003f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 9f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.48f, 1.747f)
                close()
                moveToRelative(-8.48f, 0.75f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(-0.75f)
                horizontalLineTo(3.531f)
                arcToRelative(1f, 1f, 0f, false, false, 0.969f, 0.75f)
                moveToRelative(7f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 0.969f, -0.75f)
                horizontalLineTo(11.25f)
                verticalLineToRelative(0.75f)
                close()
                moveToRelative(0.969f, -1.25f)
                arcToRelative(1f, 1f, 0f, false, false, -0.969f, -0.75f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(0.75f)
                close()
                moveTo(4.5f, 9.5f)
                arcToRelative(1f, 1f, 0f, false, false, -0.969f, 0.75f)
                horizontalLineTo(4.75f)
                verticalLineTo(9.5f)
                close()
                moveToRelative(1.75f, 2f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                close()
                moveToRelative(0.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(1.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(1.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(1f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveToRelative(0f, -1f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
            }
        }.build()
        
        return _EmojiGrimace!!
    }

private var _EmojiGrimace: ImageVector? = null

