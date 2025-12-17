package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.How_to_vote: ImageVector
    get() {
        if (_How_to_vote != null) return _How_to_vote!!
        
        _How_to_vote = ImageVector.Builder(
            name = "how_to_vote",
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
                moveTo(18f, 13f)
                horizontalLineToRelative(-0.68f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(1.91f)
                lineTo(19f, 17f)
                horizontalLineTo(5f)
                lineToRelative(1.78f, -2f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(6f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                horizontalLineTo(19f)
                curveToRelative(1.1f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineToRelative(-4f)
                lineToRelative(-3f, -3f)
                close()
                moveToRelative(-1f, -5.05f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(4.95f, -4.95f)
                lineTo(17f, 7.95f)
                close()
                moveToRelative(-4.24f, -5.66f)
                lineTo(6.39f, 8.66f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.95f, 4.95f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(14.16f, 2.3f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.4f, -1.4f, -0.01f)
                close()
            }
        }.build()
        
        return _How_to_vote!!
    }

private var _How_to_vote: ImageVector? = null

