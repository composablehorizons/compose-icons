package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkRichtext: ImageVector
    get() {
        if (_FileEarmarkRichtext != null) return _FileEarmarkRichtext!!
        
        _FileEarmarkRichtext = ImageVector.Builder(
            name = "file-earmark-richtext",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveToRelative(-3f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 12f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 10f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(1.639f, -3.708f)
                lineToRelative(1.33f, 0.886f)
                lineToRelative(1.854f, -1.855f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.289f, -0.047f)
                lineToRelative(1.888f, 0.974f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(8f)
                reflectiveCurveToRelative(1.54f, -1.274f, 1.639f, -1.208f)
                moveTo(6.25f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
            }
        }.build()
        
        return _FileEarmarkRichtext!!
    }

private var _FileEarmarkRichtext: ImageVector? = null

