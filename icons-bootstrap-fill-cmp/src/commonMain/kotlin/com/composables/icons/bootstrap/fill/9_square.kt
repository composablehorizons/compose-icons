package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`9Square`: ImageVector
    get() {
        if (_9Square != null) return _9Square!!
        
        _9Square = ImageVector.Builder(
            name = "9-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.895f, 8.174f)
                curveToRelative(0.808f, 0f, 1.535f, -0.528f, 1.535f, -1.594f)
                reflectiveCurveToRelative(-0.668f, -1.676f, -1.56f, -1.676f)
                curveToRelative(-0.838f, 0f, -1.517f, 0.616f, -1.517f, 1.659f)
                curveToRelative(0f, 1.072f, 0.708f, 1.61f, 1.54f, 1.61f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(5.777f, 12.146f)
                curveToRelative(-1.593f, 0f, -2.425f, -0.89f, -2.52f, -1.798f)
                horizontalLineToRelative(1.296f)
                curveToRelative(0.1f, 0.357f, 0.539f, 0.72f, 1.248f, 0.72f)
                curveToRelative(1.36f, 0f, 1.88f, -1.353f, 1.834f, -3.023f)
                horizontalLineToRelative(-0.076f)
                curveToRelative(-0.235f, 0.627f, -0.873f, 1.184f, -1.934f, 1.184f)
                curveToRelative(-1.395f, 0f, -2.566f, -0.961f, -2.566f, -2.666f)
                curveToRelative(0f, -1.711f, 1.242f, -2.731f, 2.87f, -2.731f)
                curveToRelative(1.512f, 0f, 2.971f, 0.867f, 2.971f, 4.014f)
                curveToRelative(0f, 2.836f, -1.02f, 4.3f, -3.123f, 4.3f)
            }
        }.build()
        
        return _9Square!!
    }

private var _9Square: ImageVector? = null

