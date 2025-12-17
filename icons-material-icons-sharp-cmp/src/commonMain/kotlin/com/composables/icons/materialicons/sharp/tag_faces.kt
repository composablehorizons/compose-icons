package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Tag_faces: ImageVector
    get() {
        if (_Tag_faces != null) return _Tag_faces!!
        
        _Tag_faces = ImageVector.Builder(
            name = "tag_faces",
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
                moveTo(12.01f, 2f)
                curveTo(6.49f, 2f, 2.02f, 6.48f, 2.02f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveToRelative(5.53f, 0f, 10.01f, -4.48f, 10.01f, -10f)
                reflectiveCurveTo(17.54f, 2f, 12.01f, 2f)
                close()
                moveToRelative(0.01f, 18f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                close()
                moveToRelative(3.5f, -9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(16.35f, 8f, 15.52f, 8f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveToRelative(-7f, 0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(9.35f, 8f, 8.52f, 8f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveToRelative(3.5f, 6.5f)
                curveToRelative(2.33f, 0f, 4.31f, -1.46f, 5.11f, -3.5f)
                horizontalLineTo(6.91f)
                curveToRelative(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f)
                close()
            }
        }.build()
        
        return _Tag_faces!!
    }

private var _Tag_faces: ImageVector? = null

