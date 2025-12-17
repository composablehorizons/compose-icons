package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.JournalCode: ImageVector
    get() {
        if (_JournalCode != null) return _JournalCode!!
        
        _JournalCode = ImageVector.Builder(
            name = "journal-code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.646f, 5.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(10.293f, 8f)
                lineTo(8.646f, 6.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                moveToRelative(-1.292f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(5.707f, 8f)
                lineToRelative(1.647f, -1.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 0f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                close()
                moveToRelative(0f, 3f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(8f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                close()
                moveToRelative(0f, 3f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                close()
            }
        }.build()
        
        return _JournalCode!!
    }

private var _JournalCode: ImageVector? = null

