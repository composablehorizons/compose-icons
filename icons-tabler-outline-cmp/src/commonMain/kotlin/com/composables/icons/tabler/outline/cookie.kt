package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cookie: ImageVector
    get() {
        if (_Cookie != null) return _Cookie!!
        
        _Cookie = ImageVector.Builder(
            name = "cookie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 8f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.148f, 3.476f)
                lineToRelative(2.667f, 1.104f)
                arcToRelative(4f, 4f, 0f, false, false, 4.656f, 6.14f)
                lineToRelative(0.053f, 0.132f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 2.296f)
                quadToRelative(-0.745f, 1.18f, -1.024f, 1.852f)
                quadToRelative(-0.283f, 0.684f, -0.66f, 2.216f)
                arcToRelative(3f, 3f, 0f, false, true, -1.624f, 1.623f)
                quadToRelative(-1.572f, 0.394f, -2.216f, 0.661f)
                quadToRelative(-0.712f, 0.295f, -1.852f, 1.024f)
                arcToRelative(3f, 3f, 0f, false, true, -2.296f, 0f)
                quadToRelative(-1.203f, -0.754f, -1.852f, -1.024f)
                quadToRelative(-0.707f, -0.292f, -2.216f, -0.66f)
                arcToRelative(3f, 3f, 0f, false, true, -1.623f, -1.624f)
                quadToRelative(-0.397f, -1.577f, -0.661f, -2.216f)
                quadToRelative(-0.298f, -0.718f, -1.024f, -1.852f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -2.296f)
                quadToRelative(0.719f, -1.116f, 1.024f, -1.852f)
                quadToRelative(0.257f, -0.62f, 0.66f, -2.216f)
                arcToRelative(3f, 3f, 0f, false, true, 1.624f, -1.623f)
                quadToRelative(1.547f, -0.384f, 2.216f, -0.661f)
                quadToRelative(0.687f, -0.285f, 1.852f, -1.024f)
                arcToRelative(3f, 3f, 0f, false, true, 2.296f, 0f)
            }
        }.build()
        
        return _Cookie!!
    }

private var _Cookie: ImageVector? = null

