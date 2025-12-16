package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Settings: ImageVector
    get() {
        if (_Settings != null) return _Settings!!
        
        _Settings = ImageVector.Builder(
            name = "settings",
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
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, false, true, 12f, 15f)
                arcTo(3f, 3f, 0f, false, true, 9f, 12f)
                arcTo(3f, 3f, 0f, false, true, 15f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.4f, 15f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, 0.33f, 1.82f)
                lineToRelative(0.06f, 0.06f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.83f)
                arcToRelative(2f, 2f, 0f, false, true, -2.83f, 0f)
                lineToRelative(-0.06f, -0.06f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -1.82f, -0.33f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -1f, 1.51f)
                verticalLineTo(21f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-0.09f)
                arcTo(1.65f, 1.65f, 0f, false, false, 9f, 19.4f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -1.82f, 0.33f)
                lineToRelative(-0.06f, 0.06f)
                arcToRelative(2f, 2f, 0f, false, true, -2.83f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.83f)
                lineToRelative(0.06f, -0.06f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, 0.33f, -1.82f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -1.51f, -1f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(0.09f)
                arcTo(1.65f, 1.65f, 0f, false, false, 4.6f, 9f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -0.33f, -1.82f)
                lineToRelative(-0.06f, -0.06f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.83f)
                arcToRelative(2f, 2f, 0f, false, true, 2.83f, 0f)
                lineToRelative(0.06f, 0.06f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, 1.82f, 0.33f)
                horizontalLineTo(9f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, 1f, -1.51f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(0.09f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, 1f, 1.51f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, 1.82f, -0.33f)
                lineToRelative(0.06f, -0.06f)
                arcToRelative(2f, 2f, 0f, false, true, 2.83f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.83f)
                lineToRelative(-0.06f, 0.06f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -0.33f, 1.82f)
                verticalLineTo(9f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, 1.51f, 1f)
                horizontalLineTo(21f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -1.51f, 1f)
                close()
            }
        }.build()
        
        return _Settings!!
    }

private var _Settings: ImageVector? = null

