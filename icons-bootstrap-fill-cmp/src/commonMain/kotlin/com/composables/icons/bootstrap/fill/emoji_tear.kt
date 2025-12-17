package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiTear: ImageVector
    get() {
        if (_EmojiTear != null) return _EmojiTear!!
        
        _EmojiTear = ImageVector.Builder(
            name = "emoji-tear",
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
                moveTo(9.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                curveToRelative(0.838f, 0f, 1.65f, 0.416f, 2.053f, 1.224f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.894f, -0.448f)
                curveTo(12.351f, 3.584f, 11.162f, 3f, 10f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveTo(7f, 6.5f)
                curveTo(7f, 5.672f, 6.552f, 5f, 6f, 5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(5.448f, 8f, 6f, 8f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
                moveTo(4.5f, 13f)
                curveToRelative(0.828f, 0f, 1.5f, -0.746f, 1.5f, -1.667f)
                curveToRelative(0f, -0.706f, -0.882f, -2.29f, -1.294f, -2.99f)
                arcToRelative(0.238f, 0.238f, 0f, false, false, -0.412f, 0f)
                curveTo(3.882f, 9.044f, 3f, 10.628f, 3f, 11.334f)
                curveTo(3f, 12.253f, 3.672f, 13f, 4.5f, 13f)
                moveTo(8f, 11.197f)
                curveToRelative(0.916f, 0f, 1.607f, 0.408f, 2.25f, 0.826f)
                curveToRelative(0.212f, 0.138f, 0.424f, -0.069f, 0.282f, -0.277f)
                curveToRelative(-0.564f, -0.83f, -1.558f, -2.049f, -2.532f, -2.049f)
                curveToRelative(-0.53f, 0f, -1.066f, 0.361f, -1.536f, 0.824f)
                quadToRelative(0.126f, 0.27f, 0.232f, 0.535f)
                quadToRelative(0.069f, 0.174f, 0.135f, 0.373f)
                arcTo(3.1f, 3.1f, 0f, false, true, 8f, 11.197f)
                moveTo(10f, 8f)
                curveToRelative(0.552f, 0f, 1f, -0.672f, 1f, -1.5f)
                reflectiveCurveTo(10.552f, 5f, 10f, 5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(9.448f, 8f, 10f, 8f)
                moveTo(6.5f, 3f)
                curveToRelative(-1.162f, 0f, -2.35f, 0.584f, -2.947f, 1.776f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.894f, 0.448f)
                curveTo(4.851f, 4.416f, 5.662f, 4f, 6.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
            }
        }.build()
        
        return _EmojiTear!!
    }

private var _EmojiTear: ImageVector? = null

