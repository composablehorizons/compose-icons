package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.New_releases: ImageVector
    get() {
        if (_New_releases != null) return _New_releases!!
        
        _New_releases = ImageVector.Builder(
            name = "new_releases",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.42f, 11.34f)
                lineToRelative(-1.86f, -2.12f)
                lineToRelative(0.26f, -2.81f)
                curveToRelative(0.05f, -0.5f, -0.29f, -0.96f, -0.77f, -1.07f)
                lineToRelative(-2.76f, -0.63f)
                lineToRelative(-1.44f, -2.43f)
                curveToRelative(-0.26f, -0.43f, -0.79f, -0.61f, -1.25f, -0.41f)
                lineTo(12f, 3f)
                lineTo(9.41f, 1.89f)
                curveToRelative(-0.46f, -0.2f, -1f, -0.02f, -1.25f, 0.41f)
                lineTo(6.71f, 4.72f)
                lineToRelative(-2.75f, 0.62f)
                curveToRelative(-0.49f, 0.11f, -0.83f, 0.56f, -0.78f, 1.07f)
                lineToRelative(0.26f, 2.8f)
                lineToRelative(-1.86f, 2.13f)
                curveToRelative(-0.33f, 0.38f, -0.33f, 0.94f, 0f, 1.32f)
                lineToRelative(1.86f, 2.12f)
                lineToRelative(-0.26f, 2.82f)
                curveToRelative(-0.05f, 0.5f, 0.29f, 0.96f, 0.77f, 1.07f)
                lineToRelative(2.76f, 0.63f)
                lineToRelative(1.44f, 2.42f)
                curveToRelative(0.26f, 0.43f, 0.79f, 0.61f, 1.26f, 0.41f)
                lineTo(12f, 21f)
                lineToRelative(2.59f, 1.11f)
                curveToRelative(0.46f, 0.2f, 1f, 0.02f, 1.25f, -0.41f)
                lineToRelative(1.44f, -2.43f)
                lineToRelative(2.76f, -0.63f)
                curveToRelative(0.49f, -0.11f, 0.82f, -0.57f, 0.77f, -1.07f)
                lineToRelative(-0.26f, -2.81f)
                lineToRelative(1.86f, -2.12f)
                curveToRelative(0.34f, -0.36f, 0.34f, -0.92f, 0.01f, -1.3f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-1f, -4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _New_releases!!
    }

private var _New_releases: ImageVector? = null

