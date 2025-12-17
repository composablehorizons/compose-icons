package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Planner_review: ImageVector
    get() {
        if (_Planner_review != null) return _Planner_review!!
        
        _Planner_review = ImageVector.Builder(
            name = "planner_review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(360f, 318f)
                lineToRelative(-88f, 402f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(128f)
                lineToRelative(113f, -520f)
                horizontalLineToRelative(79f)
                lineToRelative(122f, 572f)
                lineToRelative(78f, -332f)
                horizontalLineToRelative(80f)
                lineToRelative(72f, 280f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(80f)
                horizontalLineTo(690f)
                lineToRelative(-48f, -188f)
                lineToRelative(-82f, 348f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Planner_review!!
    }

private var _Planner_review: ImageVector? = null

