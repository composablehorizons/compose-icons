package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.RocketLaunch: ImageVector
    get() {
        if (_RocketLaunch != null) return _RocketLaunch!!
        
        _RocketLaunch = ImageVector.Builder(
            name = "rocket-launch",
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
                moveTo(15.59f, 14.37f)
                arcToRelative(6f, 6f, 0f, false, true, -5.84f, 7.38f)
                verticalLineToRelative(-4.8f)
                moveToRelative(5.84f, -2.58f)
                arcToRelative(14.98f, 14.98f, 0f, false, false, 6.16f, -12.12f)
                arcTo(14.98f, 14.98f, 0f, false, false, 9.631f, 8.41f)
                moveToRelative(5.96f, 5.96f)
                arcToRelative(14.926f, 14.926f, 0f, false, true, -5.841f, 2.58f)
                moveToRelative(-0.119f, -8.54f)
                arcToRelative(6f, 6f, 0f, false, false, -7.381f, 5.84f)
                horizontalLineToRelative(4.8f)
                moveToRelative(2.581f, -5.84f)
                arcToRelative(14.927f, 14.927f, 0f, false, false, -2.58f, 5.84f)
                moveToRelative(2.699f, 2.7f)
                curveToRelative(-0.103f, 0.021f, -0.207f, 0.041f, -0.311f, 0.06f)
                arcToRelative(15.09f, 15.09f, 0f, false, true, -2.448f, -2.448f)
                arcToRelative(14.9f, 14.9f, 0f, false, true, 0.06f, -0.312f)
                moveToRelative(-2.24f, 2.39f)
                arcToRelative(4.493f, 4.493f, 0f, false, false, -1.757f, 4.306f)
                arcToRelative(4.493f, 4.493f, 0f, false, false, 4.306f, -1.758f)
                moveTo(16.5f, 9f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                close()
            }
        }.build()
        
        return _RocketLaunch!!
    }

private var _RocketLaunch: ImageVector? = null

