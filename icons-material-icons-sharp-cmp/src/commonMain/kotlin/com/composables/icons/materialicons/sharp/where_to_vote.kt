package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Where_to_vote: ImageVector
    get() {
        if (_Where_to_vote != null) return _Where_to_vote!!
        
        _Where_to_vote = ImageVector.Builder(
            name = "where_to_vote",
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
                moveTo(12f, 2f)
                curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                curveToRelative(0f, 5.25f, 7f, 13f, 7f, 13f)
                reflectiveCurveToRelative(7f, -7.75f, 7f, -13f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveToRelative(-1.53f, 12f)
                lineToRelative(-3.48f, -3.48f)
                lineTo(8.4f, 9.1f)
                lineToRelative(2.07f, 2.07f)
                lineToRelative(5.13f, -5.14f)
                lineToRelative(1.41f, 1.42f)
                lineTo(10.47f, 14f)
                close()
            }
        }.build()
        
        return _Where_to_vote!!
    }

private var _Where_to_vote: ImageVector? = null

