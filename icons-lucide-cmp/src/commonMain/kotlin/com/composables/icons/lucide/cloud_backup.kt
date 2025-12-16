package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudBackup: ImageVector
    get() {
        if (_CloudBackup != null) return _CloudBackup!!
        
        _CloudBackup = ImageVector.Builder(
            name = "cloud-backup",
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
                moveTo(21f, 15.251f)
                arcTo(4.5f, 4.5f, 0f, false, false, 17.5f, 8f)
                horizontalLineToRelative(-1.79f)
                arcTo(7f, 7f, 0f, true, false, 3f, 13.607f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 19f)
                arcToRelative(5f, 5f, 0f, false, false, 9f, -3f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -4.5f, -4.5f)
                arcToRelative(4.82f, 4.82f, 0f, false, false, -3.41f, 1.41f)
                lineTo(7f, 15f)
            }
        }.build()
        
        return _CloudBackup!!
    }

private var _CloudBackup: ImageVector? = null

