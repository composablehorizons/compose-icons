package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GenderTrans: ImageVector
    get() {
        if (_GenderTrans != null) return _GenderTrans!!
        
        _GenderTrans = ImageVector.Builder(
            name = "gender-trans",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(1.707f)
                lineTo(3.5f, 2.793f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineToRelative(-0.647f, 0.646f)
                lineToRelative(0.822f, 0.822f)
                arcTo(4f, 4f, 0f, false, true, 8f, 3f)
                curveToRelative(1.18f, 0f, 2.239f, 0.51f, 2.971f, 1.322f)
                lineTo(14.293f, 1f)
                horizontalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(1.707f)
                lineToRelative(-3.45f, 3.45f)
                arcTo(4f, 4f, 0f, false, true, 8.5f, 10.97f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.03f)
                arcToRelative(4f, 4f, 0f, false, true, -3.05f, -5.814f)
                lineToRelative(-0.95f, -0.949f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(0.647f, -0.646f)
                lineTo(1f, 1.707f)
                verticalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                close()
                moveToRelative(5.49f, 4.856f)
                arcToRelative(3f, 3f, 0f, true, false, 5.02f, 3.288f)
                arcToRelative(3f, 3f, 0f, false, false, -5.02f, -3.288f)
            }
        }.build()
        
        return _GenderTrans!!
    }

private var _GenderTrans: ImageVector? = null

