package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.How_to_vote: ImageVector
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
                verticalLineToRelative(6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6f)
                close()
                moveToRelative(1.81f, -5.04f)
                lineTo(13.45f, 1.6f)
                lineTo(5.68f, 9.36f)
                lineToRelative(6.36f, 6.36f)
                lineToRelative(7.77f, -7.76f)
                close()
                moveToRelative(-6.35f, -3.55f)
                lineTo(17f, 7.95f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(4.95f, -4.95f)
                close()
            }
        }.build()
        
        return _How_to_vote!!
    }

private var _How_to_vote: ImageVector? = null

