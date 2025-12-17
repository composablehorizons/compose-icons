package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CommentDraft: ImageVector
    get() {
        if (_CommentDraft != null) return _CommentDraft!!
        
        _CommentDraft = ImageVector.Builder(
            name = "comment-draft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.50002f, 5f)
                curveTo(1.22402f, 5f, 1.00002f, 4.776f, 1.00002f, 4.5f)
                curveTo(1.00002f, 3.122f, 2.12102f, 2f, 3.50002f, 2f)
                curveTo(3.77602f, 2f, 4.00002f, 2.224f, 4.00002f, 2.5f)
                curveTo(4.00002f, 2.776f, 3.77602f, 3f, 3.50002f, 3f)
                curveTo(2.67302f, 3f, 2.00002f, 3.673f, 2.00002f, 4.5f)
                curveTo(2.00002f, 4.776f, 1.77602f, 5f, 1.50002f, 5f)
                close()
                moveTo(2.00002f, 7.5f)
                verticalLineTo(6.5f)
                curveTo(2.00002f, 6.224f, 1.77602f, 6f, 1.50002f, 6f)
                curveTo(1.22402f, 6f, 1.00002f, 6.224f, 1.00002f, 6.5f)
                verticalLineTo(7.5f)
                curveTo(1.00002f, 7.776f, 1.22402f, 8f, 1.50002f, 8f)
                curveTo(1.77602f, 8f, 2.00002f, 7.776f, 2.00002f, 7.5f)
                close()
                moveTo(5.62502f, 14.68f)
                lineTo(8.68702f, 12f)
                horizontalLineTo(10.499f)
                curveTo(10.775f, 12f, 10.999f, 11.776f, 10.999f, 11.5f)
                curveTo(10.999f, 11.224f, 10.775f, 11f, 10.499f, 11f)
                horizontalLineTo(8.49902f)
                curveTo(8.37802f, 11f, 8.26102f, 11.044f, 8.17002f, 11.124f)
                lineTo(4.99902f, 13.943f)
                verticalLineTo(11.501f)
                curveTo(4.99902f, 11.225f, 4.77502f, 11.001f, 4.49902f, 11.001f)
                horizontalLineTo(3.49902f)
                curveTo(2.67202f, 11.001f, 1.99902f, 10.328f, 1.99902f, 9.501f)
                curveTo(1.99902f, 9.225f, 1.77502f, 9.001f, 1.49902f, 9.001f)
                curveTo(1.22302f, 9.001f, 0.999023f, 9.225f, 0.999023f, 9.501f)
                curveTo(0.999023f, 10.879f, 2.12002f, 12.001f, 3.49902f, 12.001f)
                horizontalLineTo(3.99902f)
                verticalLineTo(13.943f)
                curveTo(3.99902f, 14.494f, 4.43202f, 14.925f, 4.98402f, 14.925f)
                curveTo(5.22002f, 14.925f, 5.44202f, 14.84f, 5.62502f, 14.68f)
                close()
                moveTo(15f, 9.5f)
                curveTo(15f, 9.224f, 14.776f, 9f, 14.5f, 9f)
                curveTo(14.224f, 9f, 14f, 9.224f, 14f, 9.5f)
                curveTo(14f, 10.327f, 13.327f, 11f, 12.5f, 11f)
                curveTo(12.224f, 11f, 12f, 11.224f, 12f, 11.5f)
                curveTo(12f, 11.776f, 12.224f, 12f, 12.5f, 12f)
                curveTo(13.879f, 12f, 15f, 10.878f, 15f, 9.5f)
                close()
                moveTo(15f, 7.5f)
                verticalLineTo(6.5f)
                curveTo(15f, 6.224f, 14.776f, 6f, 14.5f, 6f)
                curveTo(14.224f, 6f, 14f, 6.224f, 14f, 6.5f)
                verticalLineTo(7.5f)
                curveTo(14f, 7.776f, 14.224f, 8f, 14.5f, 8f)
                curveTo(14.776f, 8f, 15f, 7.776f, 15f, 7.5f)
                close()
                moveTo(15f, 4.5f)
                curveTo(15f, 3.122f, 13.879f, 2f, 12.5f, 2f)
                curveTo(12.224f, 2f, 12f, 2.224f, 12f, 2.5f)
                curveTo(12f, 2.776f, 12.224f, 3f, 12.5f, 3f)
                curveTo(13.327f, 3f, 14f, 3.673f, 14f, 4.5f)
                curveTo(14f, 4.776f, 14.224f, 5f, 14.5f, 5f)
                curveTo(14.776f, 5f, 15f, 4.776f, 15f, 4.5f)
                close()
                moveTo(11f, 2.5f)
                curveTo(11f, 2.224f, 10.776f, 2f, 10.5f, 2f)
                horizontalLineTo(5.50002f)
                curveTo(5.22402f, 2f, 5.00002f, 2.224f, 5.00002f, 2.5f)
                curveTo(5.00002f, 2.776f, 5.22402f, 3f, 5.50002f, 3f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 3f, 11f, 2.776f, 11f, 2.5f)
                close()
            }
        }.build()
        
        return _CommentDraft!!
    }

private var _CommentDraft: ImageVector? = null

