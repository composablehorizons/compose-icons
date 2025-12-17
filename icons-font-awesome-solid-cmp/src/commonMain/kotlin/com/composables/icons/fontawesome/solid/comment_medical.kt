package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CommentMedical: ImageVector
    get() {
        if (_CommentMedical != null) return _CommentMedical!!
        
        _CommentMedical = ImageVector.Builder(
            name = "comment-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 32f)
                curveTo(114.62f, 32f, 0f, 125.12f, 0f, 240f)
                curveToRelative(0f, 49.56f, 21.41f, 95f, 57f, 130.74f)
                curveTo(44.46f, 421.05f, 2.7f, 466f, 2.2f, 466.5f)
                arcTo(8f, 8f, 0f, false, false, 8f, 480f)
                curveToRelative(66.26f, 0f, 116f, -31.75f, 140.6f, -51.38f)
                arcTo(304.66f, 304.66f, 0f, false, false, 256f, 448f)
                curveToRelative(141.39f, 0f, 256f, -93.12f, 256f, -208f)
                reflectiveCurveTo(397.39f, 32f, 256f, 32f)
                close()
                moveToRelative(96f, 232f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-48f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-48f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                close()
            }
        }.build()
        
        return _CommentMedical!!
    }

private var _CommentMedical: ImageVector? = null

