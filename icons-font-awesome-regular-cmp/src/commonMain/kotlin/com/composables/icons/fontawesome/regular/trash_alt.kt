package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.TrashAlt: ImageVector
    get() {
        if (_TrashAlt != null) return _TrashAlt!!
        
        _TrashAlt = ImageVector.Builder(
            name = "trash-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268f, 416f)
                horizontalLineToRelative(24f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, -12f)
                verticalLineTo(188f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, -12f)
                horizontalLineToRelative(-24f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, 12f)
                verticalLineToRelative(216f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, 12f)
                close()
                moveTo(432f, 80f)
                horizontalLineToRelative(-82.41f)
                lineToRelative(-34f, -56.7f)
                arcTo(48f, 48f, 0f, false, false, 274.41f, 0f)
                horizontalLineTo(173.59f)
                arcToRelative(48f, 48f, 0f, false, false, -41.16f, 23.3f)
                lineTo(98.41f, 80f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 96f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(336f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineToRelative(288f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, -48f)
                verticalLineTo(128f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(96f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveTo(171.84f, 50.91f)
                arcTo(6f, 6f, 0f, false, true, 177f, 48f)
                horizontalLineToRelative(94f)
                arcToRelative(6f, 6f, 0f, false, true, 5.15f, 2.91f)
                lineTo(293.61f, 80f)
                horizontalLineTo(154.39f)
                close()
                moveTo(368f, 464f)
                horizontalLineTo(80f)
                verticalLineTo(128f)
                horizontalLineToRelative(288f)
                close()
                moveToRelative(-212f, -48f)
                horizontalLineToRelative(24f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, -12f)
                verticalLineTo(188f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, -12f)
                horizontalLineToRelative(-24f)
                arcToRelative(12f, 12f, 0f, false, false, -12f, 12f)
                verticalLineToRelative(216f)
                arcToRelative(12f, 12f, 0f, false, false, 12f, 12f)
                close()
            }
        }.build()
        
        return _TrashAlt!!
    }

private var _TrashAlt: ImageVector? = null

