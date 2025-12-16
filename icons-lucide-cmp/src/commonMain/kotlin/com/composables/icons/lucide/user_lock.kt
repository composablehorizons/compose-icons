package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserLock: ImageVector
    get() {
        if (_UserLock != null) return _UserLock!!
        
        _UserLock = ImageVector.Builder(
            name = "user-lock",
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
                moveTo(14f, 7f)
                arcTo(4f, 4f, 0f, false, true, 10f, 11f)
                arcTo(4f, 4f, 0f, false, true, 6f, 7f)
                arcTo(4f, 4f, 0f, false, true, 14f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.3f, 15f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.899f, 16f)
                horizontalLineTo(20.101f)
                arcTo(0.899f, 0.899f, 0f, false, true, 21f, 16.899f)
                verticalLineTo(20.101f)
                arcTo(0.899f, 0.899f, 0f, false, true, 20.101f, 21f)
                horizontalLineTo(13.899f)
                arcTo(0.899f, 0.899f, 0f, false, true, 13f, 20.101f)
                verticalLineTo(16.899f)
                arcTo(0.899f, 0.899f, 0f, false, true, 13.899f, 16f)
                close()
            }
        }.build()
        
        return _UserLock!!
    }

private var _UserLock: ImageVector? = null

