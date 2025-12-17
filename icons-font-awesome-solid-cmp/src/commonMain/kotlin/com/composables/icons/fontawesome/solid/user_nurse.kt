package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserNurse: ImageVector
    get() {
        if (_UserNurse != null) return _UserNurse!!
        
        _UserNurse = ImageVector.Builder(
            name = "user-nurse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(319.41f, 320f)
                lineTo(224f, 415.39f)
                lineTo(128.59f, 320f)
                curveTo(57.1f, 323.1f, 0f, 381.6f, 0f, 453.79f)
                arcTo(58.21f, 58.21f, 0f, false, false, 58.21f, 512f)
                horizontalLineTo(389.79f)
                arcTo(58.21f, 58.21f, 0f, false, false, 448f, 453.79f)
                curveTo(448f, 381.6f, 390.9f, 323.1f, 319.41f, 320f)
                close()
                moveTo(224f, 304f)
                arcTo(128f, 128f, 0f, false, false, 352f, 176f)
                verticalLineTo(65.82f)
                arcToRelative(32f, 32f, 0f, false, false, -20.76f, -30f)
                lineTo(246.47f, 4.07f)
                arcToRelative(64f, 64f, 0f, false, false, -44.94f, 0f)
                lineTo(116.76f, 35.86f)
                arcTo(32f, 32f, 0f, false, false, 96f, 65.82f)
                verticalLineTo(176f)
                arcTo(128f, 128f, 0f, false, false, 224f, 304f)
                close()
                moveTo(184f, 71.67f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                horizontalLineToRelative(21.67f)
                verticalLineTo(45f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                horizontalLineToRelative(16.66f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineTo(66.67f)
                horizontalLineTo(259f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineTo(88.33f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineTo(237.33f)
                verticalLineTo(115f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineTo(215.67f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                verticalLineTo(93.33f)
                horizontalLineTo(189f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                close()
                moveTo(144f, 160f)
                horizontalLineTo(304f)
                verticalLineToRelative(16f)
                arcToRelative(80f, 80f, 0f, false, true, -160f, 0f)
                close()
            }
        }.build()
        
        return _UserNurse!!
    }

private var _UserNurse: ImageVector? = null

