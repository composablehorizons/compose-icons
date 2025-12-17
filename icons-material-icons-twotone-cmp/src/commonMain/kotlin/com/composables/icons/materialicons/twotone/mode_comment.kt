package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mode_comment: ImageVector
    get() {
        if (_Mode_comment != null) return _Mode_comment!!
        
        _Mode_comment = ImageVector.Builder(
            name = "mode_comment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                lineToRelative(4f, 4f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 15.17f)
                lineTo(18.83f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(13.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(14.83f)
                lineTo(20f, 17.17f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Mode_comment!!
    }

private var _Mode_comment: ImageVector? = null

