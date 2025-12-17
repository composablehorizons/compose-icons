package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Where_to_vote: ImageVector
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
                moveTo(12f, 3f)
                curveTo(8.69f, 3f, 6f, 5.69f, 6f, 9f)
                curveToRelative(0f, 3.54f, 3.82f, 8.86f, 6f, 11.47f)
                curveToRelative(1.75f, -2.11f, 6f, -7.63f, 6f, -11.47f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveToRelative(-1.53f, 11f)
                lineToRelative(-3.18f, -3.18f)
                lineTo(8.71f, 9.4f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(4.6f, -4.6f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10.47f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                curveTo(7.59f, 1f, 4f, 4.59f, 4f, 9f)
                curveToRelative(0f, 5.57f, 6.96f, 13.34f, 7.26f, 13.67f)
                lineToRelative(0.74f, 0.82f)
                lineToRelative(0.74f, -0.82f)
                curveTo(13.04f, 22.34f, 20f, 14.57f, 20f, 9f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                close()
                moveToRelative(0f, 19.47f)
                curveTo(9.82f, 17.86f, 6f, 12.54f, 6f, 9f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 3.83f, -4.25f, 9.36f, -6f, 11.47f)
                close()
                moveToRelative(3.07f, -13.9f)
                lineToRelative(-4.6f, 4.6f)
                lineTo(8.71f, 9.4f)
                lineToRelative(-1.42f, 1.42f)
                lineTo(10.47f, 14f)
                lineToRelative(6.01f, -6.01f)
                close()
            }
        }.build()
        
        return _Where_to_vote!!
    }

private var _Where_to_vote: ImageVector? = null

