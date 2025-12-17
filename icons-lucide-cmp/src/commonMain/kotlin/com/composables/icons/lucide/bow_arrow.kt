package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BowArrow: ImageVector
    get() {
        if (_BowArrow != null) return _BowArrow!!
        
        _BowArrow = ImageVector.Builder(
            name = "bow-arrow",
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
                moveTo(17f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.575f, 11.082f)
                arcToRelative(13f, 13f, 0f, false, true, 1.048f, 9.027f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, -1.914f, 0.597f)
                lineTo(14f, 17f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                lineTo(3.29f, 6.29f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, 0.6f, -1.91f)
                arcToRelative(13f, 13f, 0f, false, true, 9.03f, 1.05f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -1.207f, 0.5f)
                lineToRelative(-2.646f, 2.646f)
                arcTo(0.5f, 0.5f, 0f, false, false, 3.5f, 18f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.854f, 0.354f)
                lineTo(9.5f, 18.207f)
                arcTo(1.7f, 1.7f, 0f, false, false, 10f, 17f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.707f, 14.293f)
                lineTo(21f, 3f)
            }
        }.build()
        
        return _BowArrow!!
    }

private var _BowArrow: ImageVector? = null

