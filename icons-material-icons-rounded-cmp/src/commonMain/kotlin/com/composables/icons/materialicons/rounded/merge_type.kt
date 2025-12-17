package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Merge_type: ImageVector
    get() {
        if (_Merge_type != null) return _Merge_type!!
        
        _Merge_type = ImageVector.Builder(
            name = "merge_type",
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
                moveTo(17.7f, 19.7f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.7f, -2.7f)
                lineTo(13.59f, 17f)
                lineToRelative(2.7f, 2.7f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0f)
                close()
                moveTo(8.71f, 8f)
                horizontalLineTo(11f)
                verticalLineToRelative(5.59f)
                lineToRelative(-4.71f, 4.7f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(4.71f, -4.7f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f)
                verticalLineTo(8f)
                horizontalLineToRelative(2.29f)
                curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineTo(8.35f, 7.15f)
                curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f)
                close()
            }
        }.build()
        
        return _Merge_type!!
    }

private var _Merge_type: ImageVector? = null

