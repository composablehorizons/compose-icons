package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Store: ImageVector
    get() {
        if (_Store != null) return _Store!!
        
        _Store = ImageVector.Builder(
            name = "store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 21f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.774f, 10.31f)
                arcToRelative(1.12f, 1.12f, 0f, false, false, -1.549f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.451f, 0f)
                arcToRelative(1.12f, 1.12f, 0f, false, false, -1.548f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.452f, 0f)
                arcToRelative(1.12f, 1.12f, 0f, false, false, -1.549f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.77f, -3.248f)
                lineToRelative(2.889f, -4.184f)
                arcTo(2f, 2f, 0f, false, true, 7f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 1.653f, 0.873f)
                lineToRelative(2.895f, 4.192f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.774f, 3.244f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 10.95f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-8.05f)
            }
        }.build()
        
        return _Store!!
    }

private var _Store: ImageVector? = null

