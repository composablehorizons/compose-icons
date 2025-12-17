package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Beaker: ImageVector
    get() {
        if (_Beaker != null) return _Beaker!!
        
        _Beaker = ImageVector.Builder(
            name = "beaker",
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
                moveTo(9.75f, 3.104f)
                verticalLineToRelative(5.714f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -0.659f, 1.591f)
                lineTo(5f, 14.5f)
                moveTo(9.75f, 3.104f)
                curveToRelative(-0.251f, 0.023f, -0.501f, 0.05f, -0.75f, 0.082f)
                moveToRelative(0.75f, -0.082f)
                arcToRelative(24.301f, 24.301f, 0f, false, true, 4.5f, 0f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(5.714f)
                curveToRelative(0f, 0.597f, 0.237f, 1.17f, 0.659f, 1.591f)
                lineTo(19.8f, 15.3f)
                moveTo(14.25f, 3.104f)
                curveToRelative(0.251f, 0.023f, 0.501f, 0.05f, 0.75f, 0.082f)
                moveTo(19.8f, 15.3f)
                lineToRelative(-1.57f, 0.393f)
                arcTo(9.065f, 9.065f, 0f, false, true, 12f, 15f)
                arcToRelative(9.065f, 9.065f, 0f, false, false, -6.23f, -0.693f)
                lineTo(5f, 14.5f)
                moveToRelative(14.8f, 0.8f)
                lineToRelative(1.402f, 1.402f)
                curveToRelative(1.232f, 1.232f, 0.65f, 3.318f, -1.067f, 3.611f)
                arcTo(48.309f, 48.309f, 0f, false, true, 12f, 21f)
                curveToRelative(-2.773f, 0f, -5.491f, -0.235f, -8.135f, -0.687f)
                curveToRelative(-1.718f, -0.293f, -2.3f, -2.379f, -1.067f, -3.61f)
                lineTo(5f, 14.5f)
            }
        }.build()
        
        return _Beaker!!
    }

private var _Beaker: ImageVector? = null

